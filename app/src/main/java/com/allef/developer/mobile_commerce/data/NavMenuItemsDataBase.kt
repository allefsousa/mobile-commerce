package com.allef.developer.mobile_commerce.data

import android.content.Context
import com.allef.developer.mobile_commerce.R
import com.allef.developer.mobile_commerce.domain.NavMenuItem

class NavMenuItemsDataBase(context: Context) {
    val items = listOf(
        NavMenuItem(context.getString(R.string.item_all_shoes)),
        NavMenuItem(
            context.getString(R.string.item_flip_flops)
        ),
        NavMenuItem(
            context.getString(R.string.item_cleats)
        ),
        NavMenuItem(
            context.getString(R.string.item_sandals)
        ),
        NavMenuItem(
            context.getString(R.string.item_ballet_shoes)
        ),
        NavMenuItem(
            context.getString(R.string.item_suit_shoes)
        ),
        NavMenuItem(
            context.getString(R.string.item_shoes)
        ),
        NavMenuItem(
            context.getString(R.string.item_performance_shoes)
        ),
        NavMenuItem(
            context.getString(R.string.item_contact),
            R.drawable.ic_email_black_24dp
        ),
        NavMenuItem(
            context.getString(R.string.item_about),
            R.drawable.ic_domain_black_24dp
        ),
        NavMenuItem(
            context.getString(R.string.item_privacy_policy),
            R.drawable.ic_shield_lock_black_24dp
        )
    )
}