package com.softwaremill.sttp

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try

private class CurlBackend(verbose: Boolean) extends AbstractCurlBackend[Id, Nothing](IdMonad, verbose) {}

object CurlBackend {
  def apply(verbose: Boolean = false): SttpBackend[Id, Nothing] =
    new FollowRedirectsBackend[Id, Nothing](
      new CurlBackend(verbose): SttpBackend[Id, Nothing]
    )
}

private class CurlTryBackend(verbose: Boolean) extends AbstractCurlBackend[Try, Nothing](TryMonad, verbose) {}

object CurlTryBackend {
  def apply(verbose: Boolean = false): SttpBackend[Try, Nothing] =
    new FollowRedirectsBackend[Try, Nothing](
      new CurlTryBackend(verbose): SttpBackend[Try, Nothing]
    )
}

private class CurlFutureBackend(verbose: Boolean)(implicit ec: ExecutionContext)
    extends AbstractCurlBackend[Future, Nothing](new FutureMonad()(ec), verbose) {}

object CurlFutureBackend {
  def apply(verbose: Boolean = false)(
      ec: ExecutionContext = ExecutionContext.Implicits.global): SttpBackend[Future, Nothing] =
    new FollowRedirectsBackend[Future, Nothing](
      new CurlFutureBackend(verbose)(ec): SttpBackend[Future, Nothing]
    )
}
