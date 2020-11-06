package com.example.compositepatternsample.client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.compositepatternsample.R
import com.example.compositepatternsample.composite.CompanyDirectory
import com.example.compositepatternsample.leaf.Developer
import com.example.compositepatternsample.leaf.Manager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dev1 = Developer(100, "Raju", "App Developer")
        val dev2 = Developer(101, "Prince", "TV Developer")

        val engDirectory = CompanyDirectory()
        engDirectory.addEmployee(dev1)
        engDirectory.addEmployee(dev2)

        val man1 = Manager(200, "Sada", "Project Manager")
        val man2 = Manager(201, "Vikram ", "Prince's Manager")

        val accDirectory = CompanyDirectory()
        accDirectory.addEmployee(man1)
        accDirectory.addEmployee(man2)

        val directory = CompanyDirectory()
        directory.addEmployee(engDirectory)
        directory.addEmployee(accDirectory)
        directory.showEmployeeDetails()
    }
}