import jdk.nashorn.internal.ir.RuntimeNode
import okhttp3.OkHttpClient
import okhttp3.Request

fun main(args : Array<String>) {


    val client = OkHttpClient()

    val request = Request.Builder()
        .url("https://edamam-food-and-grocery-database.p.rapidapi.com/parser?ingr=apple")
        .get()
        .addHeader("X-RapidAPI-Key", "633dab081fmsh36975f8c82c3764p121ec9jsned26e8e58094")
        .addHeader("X-RapidAPI-Host", "recipesapi2.p.rapidapi.com")
        .build()

    val response = client.newCall(request).execute()
    print(response.body?.string())



}