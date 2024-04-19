// This file is generated.

package com.mapbox.maps.extension.compose.style.sources.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import com.mapbox.bindgen.Value
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.style.IdGenerator.generateRandomSourceId
import com.mapbox.maps.extension.compose.style.sources.SourceState

/**
 * Create and [rememberSaveable] a [RasterSourceState] using [RasterSourceState.Saver].
 * [init] will be called when the [RasterSourceState] is first created to configure its
 * initial state.
 *
 * @param key An optional key to be used as a key for the saved value. If not provided we use the
 * automatically generated by the Compose runtime which is unique for the every exact code location
 * in the composition tree.
 * @param sourceId The optional sourceId for the source state, by default, a random source ID will be used.
 * @param init A function initialise this [RasterSourceState].
 */
@Composable
@MapboxExperimental
public inline fun rememberRasterSourceState(
  key: String? = null,
  sourceId: String = remember {
    generateRandomSourceId("raster")
  },
  crossinline init: RasterSourceState.() -> Unit = {}
): RasterSourceState = rememberSaveable(key = key, saver = RasterSourceState.Saver) {
  RasterSourceState(sourceId).apply(init)
}

/**
 * A raster tile source.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/sources#raster)
 *
 * @param sourceId The id of the source state, by default a random generated ID will be used.
 * @param initialProperties The initial mutable properties of the source.
 */
@MapboxExperimental
public class RasterSourceState(
  override val sourceId: String = generateRandomSourceId("raster"),
  initialProperties: List<Triple<String, Boolean, Value>> = emptyList(),
) : SourceState(
  sourceId = sourceId,
  sourceType = "raster",
  initialProperties = initialProperties,
) {

  /**
   * A URL to a TileJSON resource. Supported protocols are `http:`, `https:`, and `mapbox://<Tileset ID>`.
   */
  public var url: Url
    get() = Url(getProperty(Url.NAME) ?: Url.default.value)
    set(value) {
      setBuilderProperty(Url.NAME, value.value)
    }

  /**
   * An array of one or more tile source URLs, as in the TileJSON spec.
   */
  public var tiles: Tiles
    get() = Tiles(getProperty(Tiles.NAME) ?: Tiles.default.value)
    set(value) {
      setBuilderProperty(Tiles.NAME, value.value)
    }

  /**
   * An array containing the longitude and latitude of the southwest and northeast corners of the source's
   * bounding box in the following order: `[sw.lng, sw.lat, ne.lng, ne.lat]`. When this property is included in
   * a source, no tiles outside of the given bounds are requested by Mapbox GL.
   */
  public var bounds: Bounds
    get() = Bounds(getProperty(Bounds.NAME) ?: Bounds.default.value)
    set(value) {
      setBuilderProperty(Bounds.NAME, value.value)
    }

  /**
   * Minimum zoom level for which tiles are available, as in the TileJSON spec.
   */
  public var minZoom: MinZoom
    get() = MinZoom(getProperty(MinZoom.NAME) ?: MinZoom.default.value)
    set(value) {
      setBuilderProperty(MinZoom.NAME, value.value)
    }

  /**
   * Maximum zoom level for which tiles are available, as in the TileJSON spec. Data from tiles
   * at the maxzoom are used when displaying the map at higher zoom levels.
   */
  public var maxZoom: MaxZoom
    get() = MaxZoom(getProperty(MaxZoom.NAME) ?: MaxZoom.default.value)
    set(value) {
      setBuilderProperty(MaxZoom.NAME, value.value)
    }

  /**
   * The minimum visual size to display tiles for this layer. Only configurable for raster layers.
   */
  public var tileSize: TileSize
    get() = TileSize(getProperty(TileSize.NAME) ?: TileSize.default.value)
    set(value) {
      setBuilderProperty(TileSize.NAME, value.value)
    }

  /**
   * Influences the y direction of the tile coordinates. The global-mercator (aka Spherical Mercator) profile is assumed.
   */
  public var scheme: Scheme
    get() = Scheme(getProperty(Scheme.NAME) ?: Scheme.default.value)
    set(value) {
      setBuilderProperty(Scheme.NAME, value.value)
    }

  /**
   * Contains an attribution to be displayed when the map is shown to a user.
   */
  public var attribution: Attribution
    get() = Attribution(getProperty(Attribution.NAME) ?: Attribution.default.value)
    set(value) {
      setBuilderProperty(Attribution.NAME, value.value)
    }

  /**
   * A setting to determine whether a source's tiles are cached locally.
   */
  public var volatile: Volatile
    get() = Volatile(getProperty(Volatile.NAME) ?: Volatile.default.value)
    set(value) {
      setBuilderProperty(Volatile.NAME, value.value)
    }

  /**
   * When loading a map, if PrefetchZoomDelta is set to any number greater than 0, the map
   * will first request a tile at zoom level lower than zoom - delta, but so that
   * the zoom level is multiple of delta, in an attempt to display a full map at
   * lower resolution as quick as possible. It will get clamped at the tile source minimum zoom.
   * The default delta is 4.
   */
  public var prefetchZoomDelta: PrefetchZoomDelta
    get() = PrefetchZoomDelta(getProperty(PrefetchZoomDelta.NAME) ?: PrefetchZoomDelta.default.value)
    set(value) {
      setProperty(PrefetchZoomDelta.NAME, value.value)
    }

  /**
   * This property defines a source-specific resource budget, either in tile units or in megabytes. Whenever the
   * tile cache goes over the defined limit, the least recently used tile will be evicted from
   * the in-memory cache. Note that the current implementation does not take into account resources allocated by
   * the visible tiles.
   */
  public var tileCacheBudget: TileCacheBudget
    get() = TileCacheBudget(getProperty(TileCacheBudget.NAME) ?: TileCacheBudget.default.value)
    set(value) {
      setProperty(TileCacheBudget.NAME, value.value)
    }

  /**
   * Minimum tile update interval in seconds, which is used to throttle the tile update network requests.
   * If the given source supports loading tiles from a server, sets the minimum tile update interval.
   * Update network requests that are more frequent than the minimum tile update interval are suppressed.
   */
  public var minimumTileUpdateInterval: MinimumTileUpdateInterval
    get() = MinimumTileUpdateInterval(getProperty(MinimumTileUpdateInterval.NAME) ?: MinimumTileUpdateInterval.default.value)
    set(value) {
      setProperty(MinimumTileUpdateInterval.NAME, value.value)
    }

  /**
   * When a set of tiles for a current zoom level is being rendered and some of
   * the ideal tiles that cover the screen are not yet loaded, parent tile could be used
   * instead. This might introduce unwanted rendering side-effects, especially for raster tiles that are overscaled multiple times.
   * This property sets the maximum limit for how much a parent tile can be overscaled.
   */
  public var maxOverscaleFactorForParentTiles: MaxOverscaleFactorForParentTiles
    get() = MaxOverscaleFactorForParentTiles(getProperty(MaxOverscaleFactorForParentTiles.NAME) ?: MaxOverscaleFactorForParentTiles.default.value)
    set(value) {
      setProperty(MaxOverscaleFactorForParentTiles.NAME, value.value)
    }

  /**
   * For the tiled sources, this property sets the tile requests delay. The given delay comes in
   * action only during an ongoing animation or gestures. It helps to avoid loading, parsing and rendering
   * of the transient tiles and thus to improve the rendering performance, especially on low-end devices.
   */
  public var tileRequestsDelay: TileRequestsDelay
    get() = TileRequestsDelay(getProperty(TileRequestsDelay.NAME) ?: TileRequestsDelay.default.value)
    set(value) {
      setProperty(TileRequestsDelay.NAME, value.value)
    }

  /**
   * For the tiled sources, this property sets the tile network requests delay. The given delay comes
   * in action only during an ongoing animation or gestures. It helps to avoid loading the transient
   * tiles from the network and thus to avoid redundant network requests. Note that tile-network-requests-delay value is
   * superseded with tile-requests-delay property value, if both are provided.
   */
  public var tileNetworkRequestsDelay: TileNetworkRequestsDelay
    get() = TileNetworkRequestsDelay(getProperty(TileNetworkRequestsDelay.NAME) ?: TileNetworkRequestsDelay.default.value)
    set(value) {
      setProperty(TileNetworkRequestsDelay.NAME, value.value)
    }

  /**
   * Public companion object.
   */
  public companion object {
    /**
     * The default saver implementation for [RasterSourceState]
     */
    public val Saver: Saver<RasterSourceState, Holder> = Saver(
      save = { it.save() },
      restore = {
        RasterSourceState(
          sourceId = it.sourcedId,
          initialProperties = it.cachedProperties,
        )
      }
    )
  }
}
// End of generated file.