import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.labs_32.R
import com.example.labs_32.ui.theme.Labs_32Theme

val titleString: String = "Jetpack Compose tutorial"
val summupString: String =
    "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
val describeString: String =
    "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."

@Composable
fun ComposeBasics() {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "background",
            modifier = Modifier.fillMaxWidth(fraction = 1.0f)
        )
        Text(
            text = titleString,
            modifier = Modifier
                .padding(15.dp)
                .background(Color.LightGray),
            fontSize = 24.sp
        )
        Text(
            text = summupString,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(15.dp, 0.dp)
                .background(Color.Magenta)
        )
        Text(
            text = describeString,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(15.dp)
                .background(Color.Cyan)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Labs_32Theme {
        ComposeBasics()
    }
}