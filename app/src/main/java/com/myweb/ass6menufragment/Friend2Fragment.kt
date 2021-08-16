package com.myweb.ass6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myweb.ass6menufragment.databinding.ActivityMainBinding
import com.myweb.ass6menufragment.databinding.FragmentFriend1Binding
import com.myweb.ass6menufragment.databinding.FragmentFriend2Binding


class Friend2Fragment : Fragment() {

    private lateinit var bindingFrag: FragmentFriend2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingFrag = FragmentFriend2Binding.inflate(layoutInflater)
        bindingFrag.btnBack.setOnClickListener(){
            var fragment : Fragment? = null
            fragment = MyFragment()
            replaceFragment(fragment)
        }
        return bindingFrag.root
    }

    fun replaceFragment(someFragment:Fragment){
        var binding: ActivityMainBinding
        binding = ActivityMainBinding.inflate(layoutInflater)

        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        //transaction.replace(R.id.frameLayout, someFragment)
        transaction.replace(binding.frameLayout.id, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}