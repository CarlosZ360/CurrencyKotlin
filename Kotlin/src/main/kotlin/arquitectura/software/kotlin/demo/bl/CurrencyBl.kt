package arquitectura.software.kotlin.demo.bl

import arquitectura.software.kotlin.demo.dto.CurrencyDto
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service
import java.math.BigDecimal
import okhttp3.OkHttpClient
import okhttp3.Request

@Service
class CurrencyBl {

    fun obtain(from: String, to: String, amount: BigDecimal): CurrencyDto {
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("El monto debe ser mayor a 0")
        }

        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
            .url("https://api.apilayer.com/fixer/convert?from=$from&to=$to&amount=$amount")
            .addHeader("apikey", "hKOSY55V1VVqszEwTNp8RHfsBpmi9GZg")
            .method("GET", null)
            .build()
        val response = client.newCall(request).execute()
        val result = response.body()!!.string()

        val mapper = ObjectMapper()
        val currencyDto = mapper.readValue(result, CurrencyDto::class.java)
        return currencyDto
    }
}