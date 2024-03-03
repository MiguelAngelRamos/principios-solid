public interface IGestorMultimedia {
  void reproducir();
  void pausar();
  void detener();
  void adelantar();
  void retroceder();
  void mostrarSubtitulos();
  void ajustarVolumen(int volumen);
  void cambiarFuente(String fuente);
}

public interface IReproductor {
  void reproducir();
  void pausar();
  void detener();
}

public interface INavagable {
  void adelantar();
  void retroceder();
}

public interface IControlVolumen {
  void ajustarVolumen(int volumen);
}

public interface ISoporteSubtitulos {
  void mostrarSubtitulos();
}

public interface IControlTexto {
  void cambiarFuente(String fuente);
}

public class ReproductorVideo implements IReproductor, INavagable, IControlVolumen, ISoporteSubtitulos {
 //* DEBEN IR LAS IMPLEMENTACIONES DE LOS METODOS DE LAS INTERFACES */
}

public class ReproductorAudio implements IReproductor, INavagable, IControlVolumen {
 //* DEBEN IR LAS IMPLEMENTACIONES DE LOS METODOS DE LAS INTERFACES */
}

public class VisorTexto implements IControlTexto {
 //* DEBEN IR LAS IMPLEMENTACIONES DE LOS METODOS DE LAS INTERFACES */
}