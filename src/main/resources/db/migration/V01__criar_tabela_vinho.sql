CREATE TABLE public.vinho (
	codigo serial PRIMARY KEY,
	nome TEXT NOT NULL,
	tipo TEXT NOT NULL,
	safra INTEGER NOT NULL,
	volume INTEGER NOT NULL,
	valor NUMERIC(10, 2) NOT NULL
);