package com.motycka.edu.lesson03.model

class Square(val side: Double) : Rectangle(side, side) {
    override fun to3D(depth: Double): Shape3D = Cuboid(side, side, depth)
    fun to3D(): Shape3D = to3D(side)
}