package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card.ui.theme.Business_CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Business_CardTheme {
                Surface(modifier = Modifier.fillMaxSize().background(Color(0xFFD2E8D4)),
                    ) {
                    Logobar(
                        name = "Jennifer Doe",
                        title = "Android Developer",
                    )
                }
            }
        }
    }
}

@Composable
fun Logobar (name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(modifier = Modifier.fillMaxSize().background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.height(180.dp).width(180.dp).background(Color.DarkGray)
        )
        Text(
            text = name,
            fontSize = 26.sp,
            modifier = Modifier
        )
        Text(
            text = title,
            color = Color(0xFF3ddc84),
            modifier = Modifier
        )

    }
}
@Composable
fun Details(phone: String, social: String, gmail: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        ) {
        Row(verticalAlignment = Alignment.CenterVertically,) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "phone",
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = phone,
                modifier = Modifier.padding(bottom = 8.dp),
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "social",
                modifier = Modifier.padding(bottom = 8.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = social,
                modifier = Modifier.padding(bottom = 8.dp),
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "gmail",
                modifier = Modifier.padding(bottom = 16.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = gmail,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogobarPreview() {
    Business_CardTheme {
        Logobar(
            name = "Sumanth Gowda",
            title = "Android Developer engineer",
            )
        Details(
            phone = "+916360139510",
            social = "@sumanthgowda6888",
            gmail = "sumanthcp04@gmail.com"
        )
    }
}