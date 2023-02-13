package arquitectura.software.kotlin.demo.dto

import java.math.BigDecimal

data class RequestServiceDto(
    var from: String?,
    var to: String?,
    var amount: BigDecimal?
) {
    constructor() : this(null, null, null)
    override fun toString(): String {
        return "RequestServiceDto(from=$from, to=$to, amount=$amount)"
    }
}