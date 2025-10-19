package io.hhplus.tdd.point

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PointServiceTest(
    private val pointService: PointService
) : BehaviorSpec({

    Given("1번 유저의 포인트를 1000원 충전하고") {
        val point: UserPoint = UserPoint(1, 0, 0)
        val pointHistories: List<PointHistory> = listOf()

        When("1번 유저의 포인트를 조회하면") {

            Then("포인트는 1000원이다") {
                point.point shouldBe 1000
            }
        }

        When("1번 유저의 충전 내역을 조회하면") {

            Then("사이즈는 1이다") {
                pointHistories shouldHaveSize 1
            }
        }

        When("1번 유저의 포인트를 500원 사용하면") {

            Then("포인트는 500원이다") {
                point.point shouldBe 500
            }
        }

        When("1번 유저의 포인트를 1000원 더 충전하면") {

            Then("포인트는 2000원이다") {
                point.point shouldBe 2000
            }
        }
    }
})
