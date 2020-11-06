package com.example.compositepatternsample.leaf

import com.example.compositepatternsample.component.Employee

class Developer(private val empId: Long, private val name: String, private val position: String) :
    Employee {
    override fun showEmployeeDetails() {
        println("$empId $name $position")
    }
}