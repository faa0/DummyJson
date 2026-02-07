package com.fara.presentation.ui.screen.home

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import coil3.compose.AsyncImage
import com.fara.domain.model.response.Product
import com.fara.presentation.ui.theme.DummyJsonTheme
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.compose.koinViewModel

@SuppressLint("LocalContextGetResourceValueCall")
@OptIn(ExperimentalComposeUiApi::class)
internal class HomeScreen : Screen {

    @Composable
    override fun Content() {
        DummyJsonTheme {
            val context = LocalContext.current
            val viewModel = koinViewModel<HomeViewModel>()

            val uiState by viewModel.uiState.collectAsState()
            val listState = rememberLazyListState()

            LaunchedEffect(Unit) {
                viewModel.getProducts()
            }

            LaunchedEffect(Unit) {
                viewModel.error.collectLatest { error ->
                    Toast.makeText(
                        context,
                        context.getString(error),
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            Products(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                products = uiState.products,
                listState = listState
            )
        }
    }

    @Composable
    private fun Products(
        modifier: Modifier = Modifier,
        products: List<Product?>,
        listState: LazyListState,
    ) {
        LazyColumn(
            modifier = Modifier.then(modifier),
            state = listState,
            content = {
                items(
                    items = products
                ) { product ->
                    ProductItem(
                        imageUrl = product?.thumbnail,
                        title = product?.title,
                        description = product?.description,
                    )
                }
            },
            verticalArrangement = Arrangement.spacedBy(8.dp)
        )
    }

    @Composable
    private fun ProductItem(
        modifier: Modifier = Modifier,
        imageUrl: String?,
        title: String?,
        description: String?,
    ) {
        Row(
            modifier = Modifier
                .then(modifier)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                modifier = Modifier.size(72.dp),
                model = imageUrl,
                contentScale = ContentScale.Crop,
                contentDescription = null,
            )

            Column {
                title?.let {
                    Text(
                        text = title,
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

                description?.let {
                    Text(
                        text = description,
                        color = Color.Black,
                        fontSize = 12.sp,
                    )
                }
            }
        }
    }
}