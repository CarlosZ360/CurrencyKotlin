package arquitectura.software.kotlin.demo.dto

import java.math.BigDecimal
import java.sql.Timestamp

data class InfoServiceDto (
    var timestamp: BigDecimal?,
    var rate: BigDecimal?
        ){
    constructor() : this(null, null)
    override fun toString(): String {
        return "InfoServiceDto(timestamp=$timestamp, rate=$rate)"
    }
}