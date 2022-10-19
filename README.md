
<h1>Value Range Bar Composable</h1>

<h3>
A Visual representation of the differences between a Low - Current - High value.</h3>



For example a 
Stock's Low Price, Current Price, and High Price of the day. Below is an Example with the values
Low: 200.40, Current: 203.55, High: 205.11. The Mid Point is marked on the bottom at
202.75.  


<h3>Usage</h3>


```kotlin
@Composable
fun RangeBarExample() {
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
```


![img.png](img.png)