package arquitectura.software.kotlin.demo.api

import arquitectura.software.kotlin.demo.bl.CurrencyBl
import arquitectura.software.kotlin.demo.dto.ResponseServiceDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("api/v1/currency")
class CurrencyApi(private val currencyBl: CurrencyBl) {

    @GetMapping("/obtain")
    fun obtain(@RequestParam from: String,
               @RequestParam to: String,
               @RequestParam amount: BigDecimal): ResponseEntity<ResponseServiceDto<Any>> {
        val currencyDto = currencyBl.obtain(from, to, amount)
        val responseDto = ResponseServiceDto<Any>(currencyDto, true, "Success")
        return ResponseEntity.ok(responseDto)
    }
}