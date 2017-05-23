package com.hendisantika.tes


/**
 * Created by hendisantika on 5/15/17.
 */
class Instrument(
        var id: Int = 0,
        var name: String? = null,
        var amount: Int = 0
)

class Funder(
        var funderId: Int = 0,
        var accountHolderName: String? = null,
        var instrument: List<Instrument>? = ArrayList(),
        var name: String? = null,
        var bankCode: String? = null,
        var accountNumber: String? = null,
        var totalRepayment: Long = 0
)

class Partner(
        var id: Int = 0,
        var bankCode: String? = null,
        var bankName: String? = null,
        var accountHolderName: String? = null,
        var accountNumber: String? = null,
        var payerEmail: String? = null,
        var name: String? = null
)

class Repayment(
        var id: Int = 0,
        var repayment_va: Long = 0,
        var funder: List<Funder>? = ArrayList(),
        var partner: Partner? = null
)
