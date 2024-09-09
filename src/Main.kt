fun main() {

    //Variables a utilizar
    var opcion:Int = 0
    var opcionMenu:Int = 0
    var opcionCandidato:Int = 0
    var opcionInfluencia:Int = 0
    var votosTotales:Int = 0
    var costoCam:Int = 0

    val candidato1 = Candidato("Freddy", "Gonzalez")
    var costoCam1:Int = 0
    var votos1:Int = 0

    val candidato2 = Candidato("Franco", "Rodriguez")
    var costoCam2:Int = 0
    var votos2:Int = 0

    val candidato3 = Candidato("Juan", "Peña")
    var costoCam3:Int = 0
    var votos3:Int = 0

    while (opcionMenu != 7){
        try {
            println("""Menú Principal
            1. Votar
            2. Costo de campaña por candidato
            3. Vaciar las urnas
            4. Número total de votos
            5. Porcentaje de votos obtenidos por cada candidato
            6. Costo promedio de campaña en las elecciones
            7. Salir
            """.trimMargin())
            print("Elige una opción: ")
            opcionMenu = readln().toInt()

            when (opcionMenu){
                1 -> {
                    println("""Candidatos
                    1. Candidato 1: ${candidato1.toString()}
                    2. Candidato 2: ${candidato2.toString()}
                    3. Candidato 3: ${candidato3.toString()}
                    """.trimMargin())
                    print("Elige una opción: ")
                    opcionCandidato = readln().toInt()

                    when(opcionCandidato){
                        1-> {
                            println("""Influencia
                        1. Internet
                        2. Radio
                        3. Television
                        """.trimMargin())
                            print("Elige una opción: ")
                            opcionInfluencia = readln().toInt()

                            when(opcionInfluencia){
                                1-> {
                                    costoCam1 += 700000
                                    votos1 ++
                                }

                                2-> {
                                    costoCam1 += 200000
                                    votos1 ++
                                }

                                3-> {
                                    costoCam1 += 600000
                                    votos1 ++
                                }
                                else -> println("No eligio una opción valida")
                            }
                        }

                        2->{
                            println("""Influencia
                            1. Internet
                            2. Radio
                            3. Television
                            """.trimMargin())
                            print("Elige una opción: ")
                            opcionInfluencia = readln().toInt()

                            when(opcionInfluencia){
                                1-> {
                                    costoCam2 += 700000
                                    votos2 ++
                                }

                                2-> {
                                    costoCam2 += 200000
                                    votos2 ++
                                }

                                3-> {
                                    costoCam2 += 600000
                                    votos2 ++
                                }
                                else -> println("No eligio una opción valida")
                            }
                        }

                        3-> {
                            println("""Influencia
                            1. Internet
                            2. Radio
                            3. Television
                            """.trimMargin())
                            print("Elige una opción: ")
                            opcionInfluencia = readln().toInt()

                            when(opcionInfluencia){
                                1-> {
                                    costoCam3 += 700000
                                    votos3 ++
                                }

                                2-> {
                                    costoCam3 += 200000
                                    votos3 ++
                                }

                                3-> {
                                    costoCam3 += 600000
                                    votos3 ++
                                }
                                else -> println("No eligio una opción valida")
                            }
                        }
                        else -> println("No eligio una opción correcta")
                    }
                }

                2 -> {
                    println("""Candidatos
                        1. Candidato 1: ${candidato1.toString()}
                        2. Candidato 2: ${candidato2.toString()}
                        3. Candidato 3: ${candidato3.toString()}
                        """.trimMargin())
                    print("Elige una opción: ")
                    opcionCandidato = readln().toInt()

                    when(opcionCandidato){
                        1-> {
                            println("El costo de la campaña del candidato 1 es: $$costoCam1")
                        }

                        2-> {
                            println("El costo de la campaña del candidato 2 es: $$costoCam2")
                        }

                        3-> {
                            println("El costo de la campaña del candidato 3 es: $$costoCam3")
                        }
                        else -> println("No eligio una opción valida")
                    }
                }

                3-> {
                    votos1 = 0
                    votos2 = 0
                    votos3 = 0
                    costoCam1 = 0
                    costoCam2 = 0
                    costoCam3 = 0
                    println("!!!Se vaciaron las urnas de votación!!!")
                }

                4->{
                    votosTotales = votos1+votos2+votos3
                    println("El total de votos es: ${votosTotales}")
                    println("Candidato 1: $votos1")
                    println("Candidato 2: $votos2")
                    println("Candidato 3: $votos3")
                }

                5->{
                    votosTotales = votos1+votos2+votos3
                    println("""Candidatos
                        1. Candidato 1: ${candidato1.toString()}
                        2. Candidato 2: ${candidato2.toString()}
                        3. Candidato 3: ${candidato3.toString()}
                        """.trimMargin())
                    print("Elige una opción: ")
                    opcionCandidato = readln().toInt()

                    if (votosTotales != 0){
                        when(opcionCandidato){
                            1-> {
                                println("El porcentaje obtenido de votos del candidato 1 es: ${(votos1.toDouble()/votosTotales.toDouble())*100.0}%")
                            }

                            2-> {
                                println("El porcentaje obtenido de votos del candidato 2 es: ${(votos2.toDouble()/votosTotales.toDouble())*100.0}%")
                            }

                            3-> {
                                println("El porcentaje obtenido de votos del candidato 3 es: ${(votos3.toDouble()/votosTotales.toDouble())*100.0}%")
                            }
                            else -> println("No eligio una opción valida")
                        }
                    }
                }

                6->{
                    costoCam = costoCam1+costoCam2+costoCam3

                    println("""Candidatos
                        1. Candidato 1: ${candidato1.toString()}
                        2. Candidato 2: ${candidato2.toString()}
                        3. Candidato 3: ${candidato3.toString()}
                        """.trimMargin())
                    print("Elige una opción: ")
                    opcionCandidato = readln().toInt()

                    if (costoCam != 0){
                        when(opcionCandidato){
                            1-> {
                                println("El costo promedio de campaña para el candidato 1 es: ${(costoCam.toDouble()/votos1.toDouble())}")
                            }

                            2-> {
                                println("El costo promedio de campaña para el candidato 2 es: ${(costoCam.toDouble()/votos2.toDouble())}")
                            }

                            3-> {
                                println("El costo promedio de campaña para el candidato 3 es: ${(costoCam.toDouble()/votos3.toDouble())}")
                            }
                            else -> println("No eligio una opción valida")
                        }
                    }
                }
                7 -> {
                    opcionMenu = 7
                    votosTotales = votos1+votos2+votos3
                    println("El total de votos es: ${votosTotales}")
                    println("Candidato 1: $votos1")
                    println("Candidato 2: $votos2")
                    println("Candidato 3: $votos3")

                    val lista = mutableListOf<Int>()

                    lista.add(votos1)
                    lista.add(votos2)
                    lista.add(votos3)
                    var ganador = lista.max()

                    // No hay una validación para empates

                    if(ganador == 0){
                        println("No hay ganador")
                    }else if(ganador == votos1){
                        println("El ganador es el candidato 1 ${candidato1.toString()}")
                    } else if(ganador == votos2){
                        println("El ganador es el candidato 2 ${candidato2.toString()}")
                    }else if(ganador == votos3){
                        println("El ganador es el candidato 3 ${candidato3.toString()}")
                    }
                }
            }

        }catch (e:NumberFormatException){
            println("opción incorrecta")
        }
    }
}