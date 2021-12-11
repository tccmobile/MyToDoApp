package com.example.mytodoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytodoapp.ui.theme.MyToDoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyToDoAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ToDoScreen()
                }
            }
        }
    }
}

@Composable
fun ToDoScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("My ToDo List", color = Color.White)
            }, backgroundColor = Color.Blue)
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Add,"")
            }
        },
        content = {
            LazyColumn(){
                item{
                    Text("Eat Breakfast")
                }
                items(5){ index ->
                    Text("Go to class $index")
                }
            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyToDoAppTheme {
        ToDoScreen()
    }
}