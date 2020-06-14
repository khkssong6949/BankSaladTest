package com.hgney.banksaladtest.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.hgney.banksaladtest.R
import com.hgney.banksaladtest.datas.Account

class AccountAdapter(context: Context, resId: Int, list: List) : ArrayAdapter<Account>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        //convertView를 임시row에 저장하고, null인지 확인.
        //=> 만약 null이라면, inf로 새로 XML을 그려서 tempRow를 채워줌.

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.account_list_item, null)
        }
        val row = tempRow!!

        //tempRow는 null일 가능성을 제거했으니, 실제 row에다가 새로 대입.
        //=> 만들어진 row를 결과로 return.


        return row
    }

}