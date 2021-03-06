USE [P0011]
GO
/****** Object:  Table [dbo].[Post]    Script Date: 2/21/2020 10:30:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Post](
	[PostID] [int] IDENTITY(1,1) NOT NULL,
	[Title] [nvarchar](max) NOT NULL,
	[Picture] [nvarchar](max) NULL,
	[Contents] [ntext] NULL,
	[Date] [date] NOT NULL,
 CONSTRAINT [PK_Post] PRIMARY KEY CLUSTERED 
(
	[PostID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Post] ON 

INSERT [dbo].[Post] ([PostID], [Title], [Picture], [Contents], [Date]) VALUES (1, N'Essential skills for a happy life!', N'image/Photo1.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2020-02-19' AS Date))
INSERT [dbo].[Post] ([PostID], [Title], [Picture], [Contents], [Date]) VALUES (2, N'You''ve gotta dance', NULL, N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

William W. Purkey', CAST(N'2020-02-19' AS Date))
INSERT [dbo].[Post] ([PostID], [Title], [Picture], [Contents], [Date]) VALUES (3, N'Photo', N'image/Photo.jpg', NULL, CAST(N'2020-02-19' AS Date))
SET IDENTITY_INSERT [dbo].[Post] OFF
