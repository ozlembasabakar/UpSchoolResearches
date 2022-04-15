package com.ozlembasabakar.layoutproject

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class PremiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium)

        val builder_year_monthly = SpannableStringBuilder() // monthly plan - per year
        val builder_month_monthly = SpannableStringBuilder() // monthly plan - per month

        val builder_year_yearly = SpannableStringBuilder() // yearly plan - per year
        val builder_month_yearly = SpannableStringBuilder() // yearly plan - per month

        // monthly
        val price_year_monthly = "$143.99 "
        val Spannable_year_monthly = SpannableString(price_year_monthly)
        Spannable_year_monthly.setSpan(
            ForegroundColorSpan(Color.parseColor("#87869E")),
            0,
            price_year_monthly.length,
            0
        )
        builder_year_monthly.append(Spannable_year_monthly)

        val per_year_monthly = "per year"
        val Spannable_per_year_monthly = SpannableString(per_year_monthly)
        Spannable_per_year_monthly.setSpan(
            ForegroundColorSpan(Color.parseColor("#B9B8C6")),
            0,
            per_year_monthly.length,
            0
        )
        builder_year_monthly.append(Spannable_per_year_monthly)

        findViewById<TextView>(R.id.monthly_perYear).setText(
            builder_year_monthly,
            TextView.BufferType.SPANNABLE
        )


        val price_mounth_monthly = "$11.99 "
        val Spannable_mounth_monthly = SpannableString(price_mounth_monthly)
        Spannable_mounth_monthly.setSpan(
            ForegroundColorSpan(Color.parseColor("#87869E")),
            0,
            price_mounth_monthly.length,
            0
        )
        builder_month_monthly.append(Spannable_mounth_monthly)

        val per_month_monthly = "per month"
        val Spannable_per_month_monthly = SpannableString(per_month_monthly)
        Spannable_per_month_monthly.setSpan(
            ForegroundColorSpan(Color.parseColor("#B9B8C6")),
            0,
            per_month_monthly.length,
            0
        )
        builder_month_monthly.append(Spannable_per_month_monthly)

        findViewById<TextView>(R.id.monthly_perMonth).setText(
            builder_month_monthly,
            TextView.BufferType.SPANNABLE
        )

        // yearly
        val price_year_yearly = "$59.99 "
        val Spannable_year_yearly = SpannableString(price_year_yearly)
        Spannable_year_yearly.setSpan(
            ForegroundColorSpan(Color.parseColor("#87869E")),
            0,
            price_year_yearly.length,
            0
        )
        builder_year_yearly.append(Spannable_year_yearly)

        val per_year_yearly = "per year"
        val Spannable_per_yearly = SpannableString(per_year_yearly)
        Spannable_per_yearly.setSpan(
            ForegroundColorSpan(Color.parseColor("#B9B8C6")),
            0,
            per_year_yearly.length,
            0
        )
        builder_year_yearly.append(Spannable_per_yearly)

        findViewById<TextView>(R.id.yearly_perYear).setText(
            builder_year_yearly,
            TextView.BufferType.SPANNABLE
        )


        val price_mounth_yearly = "$4.99 "
        val Spannable_mounth_yearly = SpannableString(price_mounth_yearly)
        Spannable_mounth_yearly.setSpan(
            ForegroundColorSpan(Color.parseColor("#87869E")),
            0,
            price_mounth_yearly.length,
            0
        )
        builder_month_yearly.append(Spannable_mounth_yearly)

        val per_month_yearly = "per month"
        val Spannable_per_month_yearly = SpannableString(per_month_yearly)
        Spannable_per_month_yearly.setSpan(
            ForegroundColorSpan(Color.parseColor("#B9B8C6")),
            0,
            per_month_yearly.length,
            0
        )
        builder_month_yearly.append(Spannable_per_month_yearly)

        findViewById<TextView>(R.id.yearly_perMonth).setText(
            builder_month_yearly,
            TextView.BufferType.SPANNABLE
        )

        val buttonClick_main = findViewById<Button>(R.id.goPremiumButton)
        buttonClick_main.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


