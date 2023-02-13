package arquitectura.software.kotlin.demo.dto

data class ResponseServiceDto<T> (
    var data: Any?,
    var success: Boolean,
    var message: String?
        ){
}