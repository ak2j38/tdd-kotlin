package io.hhplus.tdd.point

interface PointInterface {

    fun findByUserId(userId: Long): UserPoint

    fun findHistoryByUserId(userId: Long): List<PointHistory>

    fun charge(userId: Long, amount: Long): UserPoint

    fun pay(userId: Long, amount: Long): UserPoint
}
