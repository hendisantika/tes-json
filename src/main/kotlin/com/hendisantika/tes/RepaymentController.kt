package com.hendisantika.tes

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hendisantika on 5/15/17.
 */
@RestController
class RepaymentController {

    private val log = LoggerFactory.getLogger(RepaymentController::class.java!!)

    @PostMapping("/investment/bulk-repayment")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun getAll(): ResponseEntity<Repayment>
    {

        val partner1 = Partner(212, "1234567891", "Bank Central Asia (BCA)",
                "Hendi Santika", "1979879879", "hendi.santika@mekar.id", "Hendi Santika")

        val instrument1 = Instrument(291, "NURJANAH", 1210000)
        val instrument2 = Instrument(292, "ROHANAH", 1220000)
        val instrument3 = Instrument(293, "YUHANAH", 1230000)
        val instrument4 = Instrument(294, "ICIH", 1240000)
        val instrument5 = Instrument(295, "IJOH", 1250000)
        val instrument6 = Instrument(296, "ESIN", 1260000)
        val instrument7 = Instrument(297, "JONI", 1270000)
        val instrument8 = Instrument(298, "ROBERT", 1280000)
        val instrument9 = Instrument(299, "KOKO", 1290000)
        val instrument10 = Instrument(340, "NURHASANAH", 1235000)

        val inst1 = listOf<Instrument>(instrument1, instrument2, instrument3, instrument7, instrument8)
        val inst2 = listOf<Instrument>(instrument4, instrument5, instrument6, instrument9, instrument10)

        val funder1 = Funder(100, "Budi Anduk", inst1, "Budi Anduk", "BCA", "1234567891", 2450L)
        val funder2 = Funder(101, "Toni Sucipto", inst2, "Toni Sucipto", "BRI", "1234567891", 2500L)

        val fund = listOf<Funder>(funder1, funder2)

        val repayment1 = Repayment(111, 19928282, fund, partner1)

        log.info("Data :  " + repayment1.toString() )
        return ResponseEntity(repayment1, HttpStatus.OK)

    }
}