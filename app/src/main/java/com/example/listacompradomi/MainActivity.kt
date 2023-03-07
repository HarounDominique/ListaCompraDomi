package com.example.listacompradomi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacompradomi.ui.theme.ListaCompraDomiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaCompraDomiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScaffoldScreen()
                }
            }
        }
    }
}

@Composable
fun ScaffoldScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista de la compra") }
            )
        }
    ) {
        MyLazyColumn(Modifier.padding(it))
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListaCompraDomiTheme {
        ScaffoldScreen()
    }
}