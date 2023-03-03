package com.example.listacompradomi

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        // state = rememberLazyListState(),  //
    ) {
        items(messages) { message -> MyComponent(message) }
    }
}