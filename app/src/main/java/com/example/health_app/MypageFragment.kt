package com.example.health_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.kakao.sdk.user.UserApiClient


class MypageFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mypage, container, false)

        val nickname = view.findViewById<TextView>(R.id.nickname) // 로그인 버튼
        val image = view.findViewById<ImageView>(R.id.img)
        val gender = view.findViewById<TextView>(R.id.gender)
        val email = view.findViewById<TextView>(R.id.email)


        UserApiClient.instance.me { user, error ->
            nickname.text = "닉네임: ${user?.kakaoAccount?.profile?.nickname}"
            gender.text = "성별: ${user?.kakaoAccount?.gender}"
            email.text = "이메일: ${user?.kakaoAccount?.email}"
            image.setImageResource("프로필 사진:${user?.kakaoAccount?.profile?.thumbnailImageUrl}".toInt())

        }

        val kakao_logout_button = view.findViewById<Button>(R.id.kakao_logout_button) // 로그인 버튼

        kakao_logout_button.setOnClickListener {
            UserApiClient.instance.logout { error ->
                if (error != null) {
                    Toast.makeText(this.requireContext(), "로그아웃 실패 $error", Toast.LENGTH_SHORT).show()
                }else {
                    Toast.makeText(this.requireContext(), "로그아웃 성공", Toast.LENGTH_SHORT).show()
                }
                val intent = Intent(this.requireContext(), LoginActivity::class.java)
                startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))

            }
        }

        val kakao_unlink_button = view.findViewById<Button>(R.id.kakao_unlink_button) // 로그인 버튼

        kakao_unlink_button.setOnClickListener {
            UserApiClient.instance.unlink { error ->
                if (error != null) {
                    Toast.makeText(this.requireContext(), "회원 탈퇴 실패 $error", Toast.LENGTH_SHORT).show()
                }else {
                    Toast.makeText(this.requireContext(), "회원 탈퇴 성공", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this.requireContext(), LoginActivity::class.java)
                    startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))

                }
            }
        }


        return view
    }


}

