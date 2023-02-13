package arquitectura.software.kotlin.demo.dto

import java.math.BigDecimal

data class CurrencyDto(
    var success: Boolean,
    var query: RequestServiceDto?,
    var info: InfoServiceDto?,
    var date: String?,
    var result: BigDecimal?
){
    constructor() : this(false,null,null,null,null)

    override fun toString(): String {
        return "CurrencyDto(success=$success, query=$query, info=$info, date='$date', result=$result)"
    }
}
