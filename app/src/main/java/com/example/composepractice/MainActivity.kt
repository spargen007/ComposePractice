package com.example.composepractice
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.theme.ComposePracticeTheme


class MainActivity : ComponentActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 4.dp, horizontal = 8.dp),
                    color = MaterialTheme.colors.background
                ) {

                        Row(modifier = Modifier.padding(20.dp), horizontalArrangement = Arrangement.Center){
                            Greeting("Android")
                            Column() {
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Click me")
                                }
                            }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
        Text(text = "Hello $name ! ", modifier = Modifier.padding(vertical = 15.dp))
    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePracticeTheme {
        Row() {
           Text(text = "Hello to android")
           Spacer(modifier = Modifier.width(3.dp))
           Text(text = "welcome to android!!!")
       }

    }
}