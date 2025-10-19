package io.hhplus.tdd.point

import io.hhplus.tdd.database.UserPointTable
import org.springframework.stereotype.Service

@Service
class PointService(
    private val userPointTable: UserPointTable
) : PointInterface {

    override fun findByUserId(userId: Long): UserPoint {
        TODO("Not yet implemented")
    }

    override fun pay(userId: Long, amount: Long): UserPoint {
        TODO("Not yet implemented")
    }

    override fun charge(userId: Long, amount: Long): UserPoint {
        TODO("Not yet implemented")
    }

    override fun findHistoryByUserId(userId: Long): List<PointHistory> {
        TODO("Not yet implemented")
    }
}
