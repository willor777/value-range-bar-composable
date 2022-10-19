package com.willor.value_range_bar_composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.willor.compose_value_range_bar.ValueRangeBar
import com.willor.compose_value_range_bar.ValueRangeBarSettings
import com.willor.value_range_bar_composable.ui.theme.ValuerangebarcomposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ValuerangebarcomposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        ValueRangeBar(
            settings = ValueRangeBarSettings.DoubleValueRange(
                modifier = Modifier.wrapContentHeight(),
                highValue = 205.11,
                highLabel = "Days High",
                curValue = 203.55,
                lowValue = 200.40,
                lowLabel = "Days Low",

            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ValuerangebarcomposableTheme {
        Greeting("Android")
    }
}