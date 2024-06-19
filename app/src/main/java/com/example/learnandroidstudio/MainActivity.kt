package com.example.learnandroidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandroidstudio.ui.theme.LearnAndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnAndroidStudioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(message = "Hi Everyone! Let's come and join my birthday party, xoxo!", from = "From Parulian", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(name: String) {
    Surface(color = Color.Cyan) {
        Text(
            text = "Hi $name!\n",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier){
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 60.sp,
            modifier = Modifier.padding(15.dp),
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(15.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    LearnAndroidStudioTheme {
        GreetingText(message = "Hi Everyone! Let's come and join my birthday party, xoxo!", from = "From Parulian")
    }
}