listOf("in").map { lang ->
  Extension(
    name = "IndoWebNovel",
    versionCode = 3,
    libVersion = "2",
    lang = lang,
    description = "",
    nsfw = false,
    // Shiawase fix: point the icon at our own catalog (upstream's
    // createExtensionIconLink would 404 — upstream has no v2.3 icon).
    icon = "https://raw.githubusercontent.com/fluxxex90etc/shiawase-novel-repo/repo/icon/ireader-in-indowebnovel-v2.3.png",
  )
}.also(::register)
