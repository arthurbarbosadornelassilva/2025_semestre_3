import express, { Request, Response } from 'express';
import dotenv from 'dotenv';

const PORT = 3000;

dotenv.config();
const app = express();

app.get('/', (req: Request, res: Response): void => {
    res.json({ok: true});
});

app.listen (PORT, () => {
    console.log(`Ouvindo porta 3000`);  // Por algum motivo, o console.log com crase(`) faz a response funcionar
});