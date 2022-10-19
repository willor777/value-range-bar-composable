package com.willor.value_range_bar_composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                    RangeBarExample()
                }
            }
        }
    }
}

@Composable
fun RangeBarExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        ValueRangeBar(
            settings = ValueRangeBarSettings.IntValueRange(
                modifier = Modifier.wrapContentHeight(),
                highValue = 205,
                highLabel = "Days High",
                curValue = 203,
                lowValue = 200,
                lowLabel = "Days Low",

            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ValuerangebarcomposableTheme {
        RangeBarExample()
    }
}