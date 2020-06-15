package com.hgney.banksaladtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hgney.banksaladtest.datas.Account

class MainActivity : BaseActivity() {

    val accountArrayList = ArrayList<Account>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setValues() {

        addAccount()

    }

    override fun setupEvents() {


    }

    fun addAccount(){
        accountArrayList.add(Account(400000,"카카오뱅크 입출금통장","12394-2194859"))
        accountArrayList.add(Account(400000,"국민은행 입출금통장","12394-2194859"))
        accountArrayList.add(Account(400000,"신한은행 입출금통장","12394-2194859"))
        accountArrayList.add(Account(400000,"우리은행 입출금통장","12394-2194859"))
        accountArrayList.add(Account(400000,"케이뱅크 입출금통장","12394-2194859"))
        accountArrayList.add(Account(400000,"웰컴저축은행 입출금통장","12394-2194859"))
    }

}