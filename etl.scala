

import scala.xml.XML

val fpath = "/Users/douglasybarbo/Projects/stackoverflow-datawarehouse-analytics-engine/Tags.xml"

val tagsContainer = XML.loadFile(fpath)

val x = tagsContainer \\ "tags" \\ "row"

val x1 = x \\ "@TagName"

val x2 = x1.toVector

val x3 = x2.map(_.toString)

