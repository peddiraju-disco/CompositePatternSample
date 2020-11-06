package com.example.compositepatternsample.composite

import com.example.compositepatternsample.component.Employee
import java.util.*

class CompanyDirectory : Employee {

    private val employeeList: MutableList<Employee> = ArrayList()

    override fun showEmployeeDetails() {
        for (emp in employeeList) {
            emp.showEmployeeDetails()
        }
    }

    fun addEmployee(emp: Employee) {
        employeeList.add(emp)
    }

    fun removeEmployee(emp: Employee) {
        employeeList.remove(emp)
    }
}