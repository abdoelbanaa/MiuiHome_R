package com.yuk.miuiHomeR.ui

import androidx.fragment.app.Fragment
import com.yuk.miuiHomeR.R
import com.yuk.miuiHomeR.ui.base.BaseAppCompatActivity
import com.yuk.miuiHomeR.ui.base.SubFragment

class FolderActivity : BaseAppCompatActivity() {

    override fun initFragment(): Fragment {
        return FolderFragment()
    }

    class FolderFragment : SubFragment() {
        override fun getContentResId(): Int {
            return R.xml.prefs_folder
        }

        override fun initPrefs() {}
    }
}