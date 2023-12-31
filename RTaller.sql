USE [master]
GO
/****** Object:  Database [RTaller]    Script Date: 12/2/2021 9:08:04 PM ******/
CREATE DATABASE [RTaller]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'RTaller', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\RTaller.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'RTaller_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\RTaller_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [RTaller] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [RTaller].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [RTaller] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [RTaller] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [RTaller] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [RTaller] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [RTaller] SET ARITHABORT OFF 
GO
ALTER DATABASE [RTaller] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [RTaller] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [RTaller] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [RTaller] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [RTaller] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [RTaller] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [RTaller] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [RTaller] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [RTaller] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [RTaller] SET  DISABLE_BROKER 
GO
ALTER DATABASE [RTaller] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [RTaller] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [RTaller] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [RTaller] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [RTaller] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [RTaller] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [RTaller] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [RTaller] SET RECOVERY FULL 
GO
ALTER DATABASE [RTaller] SET  MULTI_USER 
GO
ALTER DATABASE [RTaller] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [RTaller] SET DB_CHAINING OFF 
GO
ALTER DATABASE [RTaller] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [RTaller] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [RTaller] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [RTaller] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'RTaller', N'ON'
GO
ALTER DATABASE [RTaller] SET QUERY_STORE = OFF
GO
USE [RTaller]
GO
/****** Object:  Table [dbo].[Inventario]    Script Date: 12/2/2021 9:08:04 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Inventario](
	[CodProducto] [int] NULL,
	[nombre] [varchar](50) NULL,
	[descripcion] [varchar](50) NULL,
	[estante] [varchar](50) NULL,
	[precio] [float] NULL,
	[stock] [int] NULL,
	[salida] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Usuario]    Script Date: 12/2/2021 9:08:04 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Usuario](
	[id] [int] NULL,
	[username] [varchar](50) NULL,
	[pw] [varchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (1, N'Amortiguadores', N'Amortiguadores delantero', N'A', 100, 7, 1)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (2, N'Amortiguadores', N'Amortiguadores traseros', N'A', 100, 8, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (3, N'Balancines', N'Balancines admisión', N'B', 200, 10, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (4, N'Batería seca 12V', N'Batería seca 12V moto', N'B', 300, 2, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (5, N'Bujía', N'Bujía de iridio', N'B', 100, 10, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (6, N'Cadena', N'Cadena de arrastre', N'C', 250, 2, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (7, N'Cigüeñal', N'Cigüeñal de moto', N'C', 400, 1, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (8, N'Claxon', N'Claxon para moto', N'C', 310, 5, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (9, N'Disco', N'Disco de embrague', N'D', 600, 1, NULL)
INSERT [dbo].[Inventario] ([CodProducto], [nombre], [descripcion], [estante], [precio], [stock], [salida]) VALUES (10, N'Luces', N'Luces LED para moto', N'L', 250, 100, NULL)
GO
INSERT [dbo].[Usuario] ([id], [username], [pw]) VALUES (NULL, N'Jorge', N'1234')
INSERT [dbo].[Usuario] ([id], [username], [pw]) VALUES (NULL, N'Norman', N'1234')
INSERT [dbo].[Usuario] ([id], [username], [pw]) VALUES (NULL, N'Yizark', N'1234')
INSERT [dbo].[Usuario] ([id], [username], [pw]) VALUES (NULL, N'Octavio', N'1234')
INSERT [dbo].[Usuario] ([id], [username], [pw]) VALUES (NULL, N'Armando', N'1234')
INSERT [dbo].[Usuario] ([id], [username], [pw]) VALUES (NULL, N'Admin', N'1234')
GO
USE [master]
GO
ALTER DATABASE [RTaller] SET  READ_WRITE 
GO
