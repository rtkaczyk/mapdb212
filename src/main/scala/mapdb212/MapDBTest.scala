package mapdb212

import org.mapdb.{DBMaker, Serializer}

object MapDBTest extends App {

  val db = DBMaker.memoryDB().make()
  val someMap = db.hashMap("some-map", Serializer.STRING, Serializer.STRING).createOrOpen()

  someMap.put("x", "World!")
  println("Hello " + someMap.get("x"))
}
