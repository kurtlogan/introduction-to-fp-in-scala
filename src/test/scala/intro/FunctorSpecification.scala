package intro

import test._

object FunctorSpecification extends Properties("Functor") {

  property("functor: fpair") =
    Functor.fpair(Id(2)) ?= Id((2,2))

  property("functor: fproduct") =
    Functor.fproduct(Id(2))(_ + 1) ?= Id((2,3))

  property("functor: strengthL") =
    Functor.strengthL(1, Id(2)) ?= Id((1,2))

  property("functor: strengthR") =
    Functor.strengthR(Id(1), 2) ?= Id((1,2))
}
