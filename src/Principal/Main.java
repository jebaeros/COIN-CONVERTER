package Principal;

import Elementos.Consulta;
import Elementos.CurrencyConverter;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /////DECLARACION DE VARIABLES
        Scanner teclado = new Scanner(System.in);
        while (true) {
            ////EJECUCION DEL CODIGO
            System.out.println("""
                    BIENVENIDO AL CONVERSOR DE MONEDA
                    
                    Indique la moneda a convertir o indique 0 para salir:
                    1.	USD - Estados Unidos
                    2.	AED - Emiratos Árabes Unidos
                    3.	AFN - Afganistán
                    4.	ALL - Albania
                    5.	AMD - Armenia
                    6.	ANG - Antillas Neerlandesas
                    7.	AOA - Angola
                    8.	ARS - Argentina
                    9.	AUD - Australia
                    10.	AWG - Aruba
                    11.	AZN - Azerbaiyán
                    12.	BAM - Bosnia-Herzegovina
                    13.	BBD - Barbados
                    14.	BDT - Bangladesh
                    15.	BGN - Bulgaria
                    16.	BHD - Bahréin
                    17.	BIF - Burundi
                    18.	BMD - Bermudas
                    19.	BND - Brunéi
                    20.	BOB - Bolivia
                    21.	BRL - Brasil
                    22.	BSD - Bahamas
                    23.	BTN - Bután
                    24.	BWP - Botsuana
                    25.	BYN - Bielorrusia
                    26.	BZD - Belice
                    27.	CAD - Canadá
                    28.	CDF - República Democrática del Congo
                    29.	CHF - Suiza
                    30.	CLP - Chile
                    31.	CNY - China
                    32.	COP - Colombia
                    33.	CRC - Costa Rica
                    34.	CUP - Cuba
                    35.	CVE - Cabo Verde
                    36.	CZK - República Checa
                    37.	DJF - Yibuti
                    38.	DKK - Dinamarca
                    39.	DOP - República Dominicana
                    40.	DZD - Argelia
                    41.	EGP - Egipto
                    42.	ERN - Eritrea
                    43.	ETB - Etiopía
                    44.	EUR - Eurozona
                    45.	FJD - Fiyi
                    46.	FKP - Islas Malvinas
                    47.	FOK - Islas Feroe
                    48.	GBP - Reino Unido
                    49.	GEL - Georgia
                    50.	GGP - Guernsey
                    51.	GHS - Ghana
                    52.	GIP - Gibraltar
                    53.	GMD - Gambia
                    54.	GNF - Guinea
                    55.	GTQ - Guatemala
                    56.	GYD - Guyana
                    57.	HKD - Hong Kong
                    58.	HNL - Honduras
                    59.	HRK - Croacia
                    60.	HTG - Haití
                    61.	HUF - Hungría
                    62.	IDR - Indonesia
                    63.	ILS - Israel
                    64.	IMP - Isla de Man
                    65.	INR - India
                    66.	IQD - Irak
                    67.	IRR - Irán
                    68.	ISK - Islandia
                    69.	JEP - Jersey
                    70.	JMD - Jamaica
                    71.	JOD - Jordania
                    72.	JPY - Japón
                    73.	KES - Kenia
                    74.	KGS - Kirguistán
                    75.	KHR - Camboya
                    76.	KID - Kiribati
                    77.	KMF - Comoras
                    78.	KRW - Corea del Sur
                    79.	KWD - Kuwait
                    80.	KYD - Islas Caimán
                    81.	KZT - Kazajistán
                    82.	LAK - Laos
                    83.	LBP - Líbano
                    84.	LKR - Sri Lanka
                    85.	LRD - Liberia
                    86.	LSL - Lesoto
                    87.	LYD - Libia
                    88.	MAD - Marruecos
                    89.	MDL - Moldavia
                    90.	MGA - Madagascar
                    91.	MKD - Macedonia del Norte
                    92.	MMK - Myanmar
                    93.	MNT - Mongolia
                    94.	MOP - Macao
                    95.	MRU - Mauritania
                    96.	MUR - Mauricio
                    97.	MVR - Maldivas
                    98.	MWK - Malaui
                    99.	MXN - México
                    100.	MYR - Malasia
                    101.	MZN - Mozambique
                    102.	NAD - Namibia
                    103.	NGN - Nigeria
                    104.	NIO - Nicaragua
                    105.	NOK - Noruega
                    106.	NPR - Nepal
                    107.	NZD - Nueva Zelanda
                    108.	OMR - Omán
                    109.	PAB - Panamá
                    110.	PEN - Perú
                    111.	PGK - Papúa Nueva Guinea
                    112.	PHP - Filipinas
                    113.	PKR - Pakistán
                    114.	PLN - Polonia
                    115.	PYG - Paraguay
                    116.	QAR - Catar
                    117.	RON - Rumania
                    118.	RSD - Serbia
                    119.	RUB - Rusia
                    120.	RWF - Ruanda
                    121.	SAR - Arabia Saudita
                    122.	SBD - Islas Salomón
                    123.	SCR - Seychelles
                    124.	SDG - Sudán
                    125.	SEK - Suecia
                    126.	SGD - Singapur
                    127.	SHP - Santa Elena
                    128.	SLE - Sierra Leona
                    129.	SLL - Sierra Leona
                    130.	SOS - Somalia
                    131.	SRD - Surinam
                    132.	SSP - Sudán del Sur
                    133.	STN - Santo Tomé y Príncipe
                    134.	SYP - Siria
                    135.	SZL - Esuatini
                    136.	THB - Tailandia
                    137.	TJS - Tayikistán
                    138.	TMT - Turkmenistán
                    139.	TND - Túnez
                    140.	TOP - Tonga
                    141.	TRY - Turquía
                    142.	TTD - Trinidad y Tobago
                    143.	TVD - Tuvalu
                    144.	TWD - Taiwán
                    145.	TZS - Tanzania
                    146.	UAH - Ucrania
                    147.	UGX - Uganda
                    148.	UYU - Uruguay
                    149.	UZS - Uzbekistán
                    150.	VES - Venezuela
                    151.	VND - Vietnam
                    152.	VUV - Vanuatu
                    153.	WST - Samoa
                    154.	XAF - África Central
                    155.	XCD - Organización de Estados del Caribe Oriental
                    156.	XDR - Fondo Monetario Internacional
                    157.	XOF - África Occidental
                    158.	XPF - CFP Franc
                    159.	YER - Yemen
                    160.	ZAR - Sudáfrica
                                        
                    """);
            var eleccionOrigen = teclado.nextInt();
            if (eleccionOrigen==0){
                System.out.println("gracias por usar el conversor");
                break;
            }
            else {
                var currencyCode = new CurrencyConverter().Formato().getOrDefault(eleccionOrigen, "no esta en la lista");
                System.out.println("Currency code for index:" + eleccionOrigen + "->" + currencyCode);
                var respuesta = new Consulta().obtenerDatos(currencyCode).conversion_rates();
                System.out.println(respuesta);
                var eleccionObjetivo = teclado.nextInt();
                var indicativo = new CurrencyConverter().Formato().getOrDefault(eleccionObjetivo, "no esta en la lista");
                System.out.println("Currency code for index:" + eleccionObjetivo + "->" + currencyCode);
                var tasa = respuesta.get(indicativo);
                System.out.println(tasa + indicativo);
            }
            System.out.println("desea continuar? 1 para si , 0 para no");
            var reinicio = teclado.nextInt();
            if (reinicio==0){
                break;
            }
        }
    }
}