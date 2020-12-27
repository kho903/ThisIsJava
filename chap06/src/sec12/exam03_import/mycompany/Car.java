package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hankook.Tire;
import sec12.exam03_import.hyundai.*;
// import sec12.exam03_import.hyundai.Engine;
import sec12.exam03_import.kumho.*;

public class Car {
	// ctrl + shift + o : 자동 import
	// window - preferences - java - code style - organize imports
	// number of imports needed for .* 칸 99 -> 1로 변경 하면
	// 자동 import시  * 로 import
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	Tire tire3 = new Tire();
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
}
