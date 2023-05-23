package com.example.recyclerseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerseries.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        fibonacciNums()
        printNumbers()



    }

    fun fibonacciNums() {
        var numberList = fabonacciNumbers(100)
        var numberAdapter = NumberRecycleViewAdapter(numberList)
        binding.rvNum.layoutManager = LinearLayoutManager(this)
        binding.rvNum.adapter = numberAdapter


    }

    fun fabonacciNumbers(size: Int): ArrayList<Int> {
        var numberList = ArrayList<Int>()
        var num1 = 0
        var num2 = 1
        var number = 0
        while (number <= size) {
            print(num1)
            var sum = num1 + num2
            num1 = num2
            num2 = sum
            number++
            numberList += sum

        }
        return numberList


    }
    private fun printNumbers() {
        for (i in 1..100) {
            println(i.toString())
        }
    }
}
