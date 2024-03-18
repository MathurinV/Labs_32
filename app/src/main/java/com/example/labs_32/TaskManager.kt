import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.labs_32.R
import com.example.labs_32.ui.theme.Labs_32Theme

val resultString: String = "All tasks completed"
val congratulationString: String = "Nice work!"

@Composable
fun TaskManager() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = "background",
            modifier = Modifier.fillMaxWidth(fraction = 1.0f)
        )
        Box(
            modifier = Modifier.height(10.dp)
        ) {

        }
        Text(
            text = resultString,
            fontWeight = FontWeight.Bold
        )
        Text(text = congratulationString)
    }
}


@Composable
@Preview
fun TaskPreview() {
    Labs_32Theme {
        TaskManager()
    }
}