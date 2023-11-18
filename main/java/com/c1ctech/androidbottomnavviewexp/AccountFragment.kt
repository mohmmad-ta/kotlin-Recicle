package com.c1ctech.androidbottomnavviewexp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_account.*


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {
        return inflater.inflate(R.layout.fragment_account, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharPer = requireContext().getSharedPreferences("MY_PER", Context.MODE_PRIVATE)
        val UserName = sharPer.getString("NAME", "").toString()
        val UserEmail = sharPer.getString("EMAIL", "").toString()
        val UserPassword = sharPer.getString("PASSWORD", "").toString()
        textView5.text = UserName
        textView6.text = "Email : ${UserEmail}"
        textView7.text = "Password : ${UserPassword}"
        // You can now use myTextView to manipulate the TextView as needed
    }


    companion object {

        fun newInstance() = AccountFragment()
    }
}