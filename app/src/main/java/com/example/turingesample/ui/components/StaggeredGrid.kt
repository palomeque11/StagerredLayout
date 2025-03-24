package com.example.turingesample.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun StaggeredGrid(
    modifier: Modifier = Modifier,
    tiles: List<StaggeredTile>,
    onClick: (StaggeredTile) -> Unit
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(4), // Maximum 4 columns
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalItemSpacing = 8.dp,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(tiles) { tile ->
            Box(
                modifier = Modifier
                    .fillMaxWidth(tile.width / 4f) // Set width proportionally
                    .height((tile.height * 150).dp) // Control height dynamically
                    .background(color = tile.color)
                    .clickable { onClick(tile) },
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = tile.icon,
                    tint = Color.White,
                    contentDescription = null
                )
            }
        }
    }
}

data class StaggeredTile(val width: Int, val height: Int, val color: Color, val icon: ImageVector)