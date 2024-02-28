package com.example.task3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task3.ui.theme.Task3Theme
import com.example.task3.ui.theme.Task3Theme

class Task3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2(R.drawable.iron_man, "Iron Man", "Age: 43")
                    Greeting2(R.drawable.hulk, "Hulk ", "Age: 38")
                    Greeting2(R.drawable.man, "Dead pool", "Age: 25")
                    Greeting2(R.drawable.x_man, "Wolverine", "Age: 48")
                    Greeting2(R.drawable.women, "Women", "Age: 30")
                    Greeting2(R.drawable.thor, "Thor", "Age: 35")
                }
            }
        }
    }
}

@Composable
fun Greeting2( imgId: Int, name: String, age:String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column (){
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = age, fontWeight = FontWeight.Light, fontSize = 12.sp)
        }

    }
}
@Preview(showBackground = true, showSystemUi = true, )
@Composable
fun GreetingPreview2() {
    Column {
        Greeting2(R.drawable.iron_man, "Iron Man", "Age: 43")
        Greeting2(R.drawable.hulk, "Hulk ", "Age: 38")
        Greeting2(R.drawable.man, "Dead pool", "Age: 25")
        Greeting2(R.drawable.x_man, "X_man", "Age: 48")
        Greeting2(R.drawable.women, "Women", "Age: 30")
        Greeting2(R.drawable.thor, "Thor", "Age: 35")
    }

}